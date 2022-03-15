package com.cg.smms.repository;

import com.cg.smms.entities.Mall;

public interface IMallRepository {
	Mall addMall(Mall mall);

	Mall updateMall(Mall mall);

	Mall searchMall(long id);

	void beginTransaction();

	void commitTransaction();
}
