package com.cg.smms.repository;

import com.cg.smms.entities.Item;

public interface IItemRepository {
	Item addItem(Item item);

	Item updateItem(Item item);

	Item searchItem(long id);

	Item deleteItem(long id);

	void commitTransaction();

	void beginTransaction();
}
