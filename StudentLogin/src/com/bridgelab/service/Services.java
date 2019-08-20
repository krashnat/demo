package com.bridgelab.service;

import javax.servlet.http.HttpServletRequest;

public interface Services {
	int doRegister(HttpServletRequest request);
	void doLogin();
}
