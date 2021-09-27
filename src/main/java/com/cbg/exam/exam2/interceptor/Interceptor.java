package com.cbg.exam.exam2.interceptor;

import com.cbg.exam.exam2.container.ContainerComponent;
import com.cbg.exam.exam2.http.Rq;

public abstract class Interceptor implements ContainerComponent {
	abstract public boolean runBeforeAction(Rq rq);
}
