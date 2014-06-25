package com.octo.reactive.audit.java.nio.channels;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import static com.octo.reactive.audit.lib.Latency.HIGH;

/**
 * Created by pprados on 18/06/2014.
 */
@Aspect
public class SelectorAudit extends AbstractChannelsAudit
{
	@Before("call(int java.nio.channels.Selector.select(..))")
	public void select(JoinPoint thisJoinPoint)
	{
		latency(HIGH, thisJoinPoint);
	}

}