package com.example.demo.repositories;

import com.example.demo.Model.PatientRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRecordRepository  extends JpaRepository<PatientRecord,Long> {
}
