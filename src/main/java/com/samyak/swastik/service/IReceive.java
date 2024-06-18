package com.samyak.swastik.service;

import com.samyak.swastik.domain.Receive;
import com.samyak.swastik.dto.ReceiveInfo;

public interface IReceive {

	public Receive save(ReceiveInfo receiveInfo);
}
