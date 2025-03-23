package com.autopark.dto;

public class AdminRequest {
    private String adminAction; // Example: "ADD_SLOT", "REMOVE_SLOT", etc.
    private Long slotId;
    private String details;

    public AdminRequest() {
    }

    public AdminRequest(String adminAction, Long slotId, String details) {
        this.adminAction = adminAction;
        this.slotId = slotId;
        this.details = details;
    }

    public String getAdminAction() {
        return adminAction;
    }

    public void setAdminAction(String adminAction) {
        this.adminAction = adminAction;
    }

    public Long getSlotId() {
        return slotId;
    }

    public void setSlotId(Long slotId) {
        this.slotId = slotId;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

