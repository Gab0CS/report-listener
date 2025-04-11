package com.gabo.report_listener.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.gabo.report_listener.documents.ReportDocument;

public interface ReportRepository extends MongoRepository<ReportDocument, String> {

}
