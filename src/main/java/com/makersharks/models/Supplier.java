package com.makersharks.model;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long supplierId;

    private String companyName;
    private String website;
    private String location;

    @Enumerated(EnumType.STRING)
    private NatureOfBusiness natureOfBusiness;

    @ElementCollection(targetClass = ManufacturingProcess.class)
    @Enumerated(EnumType.STRING)
    private Set<ManufacturingProcess> manufacturingProcesses;

    // Getters and Setters
}

public enum NatureOfBusiness {
    SMALL_SCALE,
    MEDIUM_SCALE,
    LARGE_SCALE
}

public enum ManufacturingProcess {
    MOULDING,
    _3D_PRINTING,
    CASTING,
    COATING
}
