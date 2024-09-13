package com.example.demo.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
public class ChemicalElement {
    @Id
    @GeneratedValue
    private Long id; // DB Primary Key

    @Column(name = "name")
    private String name; // 원소 영문이름

    @Column(name = "symbol")
    private String symbol; // 원소 기호

    @Column(name = "standard_atomic_weight")
    private float standardAtomicWeight; // 표준 원자량

    @Column(name = "atomic_number")
    private int atomicNumber; // 원자 번호

    @Column(name = "chemical_group")
    private byte group; // 족

    @Column(name = "chemical_period")
    private byte period; // 주기

    @Column(name = "chemical_series")
    private String chemicalSeries; // 화학 계열

    @Column(name = "electron_configuration")
    private String electronConfiguration; // 전자 배열

    @Column(name = "electron_per_shell")
    private String electronsPerShell; // 준위별 전자 수

    @Column(name = "appearance")
    private String appearance; // 외형

    @Column(name = "chemical_phase")
    private String phase; // 상태

    @Column(name = "melting_point")
    private float meltingPoint; // 녹는 점

    @Column(name = "boiling_point")
    private float boilingPoint; // 끓는 점

    @Column(name = "density")
    private float density; // 밀도

    @Column(name = "liquid_density_at_MP")
    private float liquidDensityAtMP; // 액체(녹는 점)일 때 밀도

    @Column(name = "liquid_density_at_BP")
    private float liquidDensityAtBP; // 액체(끓는 점)일 때 밀도

    @Column(name = "triple_point_temperature")
    private float triplePointT; // 삼중점 온도

    @Column(name = "triple_point_pressure")
    private float triplePointP; // 삼중점 압력

    @Column(name = "heat_of_fusion")
    private float heatOfFusion; // 융해열

    @Column(name = "heat_of_vaporization")
    private float heatOfVaporization; // 기화열

    @Column(name = "heat_of_capacity")
    private float heatOfCapacity; // 몰열용량
}