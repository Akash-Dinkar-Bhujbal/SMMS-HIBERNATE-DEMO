package com.cg.smms.repository;

import com.cg.smms.entities.MallAdmin;

public interface IMallAdminRepository {

	MallAdmin addMallAdmin(MallAdmin mallAdmin);

	MallAdmin updateMallAdmin(MallAdmin mallAdmin);

	MallAdmin searchMallAdmin(long id);

	MallAdmin deleteMallAdmin(long id);

	void beginTransaction();

	void commitTransaction();

}
