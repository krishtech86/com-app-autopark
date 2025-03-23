package com.autopark.dto;

public class AdminRequest {

    private String adminAcgtion; //Example: Add_SLOT, Remove_SLOT

    private String slotId;

    private String details;

    public AdminRequest(){

    }

    public AdminRequest(String adminAcgtion, String slotId, String details) {
        this.adminAcgtion = adminAcgtion;
        this.slotId = slotId;
        this.details = details;
    }

    public String getAdminAcgtion() {
        return adminAcgtion;
    }

    public AdminRequest setAdminAcgtion(String adminAcgtion) {
        this.adminAcgtion = adminAcgtion;
        return this;
    }

    public String getSlotId() {
        return slotId;
    }

    public AdminRequest setSlotId(String slotId) {
        this.slotId = slotId;
        return this;
    }

    public String getDetails() {
        return details;
    }

    public AdminRequest setDetails(String details) {
        this.details = details;
        return this;
    }
}
