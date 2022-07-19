package com.project.mirinae.domain.manual.service;

import com.project.mirinae.domain.manual.presentation.dto.response.ManualDataResponse;
import com.project.mirinae.domain.manual.repository.ManualRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ManualCategoryInquiryService {

    private static final Logger log = LoggerFactory.getLogger(ManualCategoryInquiryService.class);
    private final ManualRepository manualRepository;

    public ManualDataResponse execute(String searhBy) {
        return null;
    }

}
