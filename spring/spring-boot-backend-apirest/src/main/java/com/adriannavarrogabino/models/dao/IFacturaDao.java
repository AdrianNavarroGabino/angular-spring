package com.adriannavarrogabino.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.adriannavarrogabino.models.entity.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
