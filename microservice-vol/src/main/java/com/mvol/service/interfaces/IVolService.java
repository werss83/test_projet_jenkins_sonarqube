package com.mvol.service.interfaces;

import java.util.List;

import com.mvol.entities.Vol;

public interface IVolService {
	List<Vol> findAll();

	Vol findOne(Long id);

	Vol save(Vol vol);

	void delete(Long id);
}
