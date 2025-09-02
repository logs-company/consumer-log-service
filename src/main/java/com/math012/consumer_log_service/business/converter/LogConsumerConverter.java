package com.math012.consumer_log_service.business.converter;

import com.math012.consumer_log_service.infra.model.LogEntity;
import dtolog.LogDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LogConsumerConverter {
    LogEntity forLogEntityFromLogDTO(LogDTO logDTO);
}
