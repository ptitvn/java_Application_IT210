package org.example.model;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class SystemConfig {

    @Value("Cyber Center")
    private String branchName;

    @Value("08:00 AM")
    private String openingHour;

    public String getBranchName() {
        return branchName;
    }

    public String getOpeningHour() {
        return openingHour;
    }

    @Override
    public String toString() {
        return "Chi nhánh: " + branchName + ", Giờ mở cửa: " + openingHour;
    }
}
