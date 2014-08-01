package com.octo.reactive.audit.javax.sql;

import com.octo.reactive.audit.AbstractNetworkAudit;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import static com.octo.reactive.audit.lib.Latency.HIGH;

// Nb methods: 1
@Aspect
public class RowSetReaderAudit extends AbstractNetworkAudit
{
	@Before("call(* javax.sql.RowSetReader.readData(javax.sql.RowSetInternal))")
	public void readData(JoinPoint thisJoinPoint)
	{
		latency(HIGH, thisJoinPoint);
	}

}