package com.math012.consumer_log_service.business.service;

import com.math012.consumer_log_service.business.converter.ConverterJson;
import com.math012.consumer_log_service.business.converter.LogConsumerConverter;
import com.math012.consumer_log_service.infra.repository.LogRepository;
import dtolog.LogDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogConsumerService {

    @Autowired
    private LogRepository repository;

    @Autowired
    private ConverterJson convertJson;

    @Autowired
    private LogConsumerConverter mapper;

    public void getLog(String log){
        LogDTO logDTO = convertJson.readJson(log, LogDTO.class);
        repository.save(mapper.forLogEntityFromLogDTO(logDTO));
    }
}