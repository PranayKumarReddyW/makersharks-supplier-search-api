package com.makersharks.service;

import com.makersharks.model.*;
import com.makersharks.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> searchSuppliers(String location, NatureOfBusiness natureOfBusiness,
            ManufacturingProcess manufacturingProcess) {
        return supplierRepository.findByLocationAndNatureOfBusinessAndManufacturingProcessesContaining(
                location, natureOfBusiness, manufacturingProcess);
    }
}
