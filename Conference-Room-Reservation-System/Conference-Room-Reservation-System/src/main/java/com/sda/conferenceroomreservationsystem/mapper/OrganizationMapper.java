package com.sda.conferenceroomreservationsystem.mapper;

import com.sda.conferenceroomreservationsystem.model.dto.OrganizationDto;
import com.sda.conferenceroomreservationsystem.model.entity.Organization;
import com.sda.conferenceroomreservationsystem.model.request.OrganizationRequest;

public class OrganizationMapper {

    public static Organization map(final OrganizationRequest request) {
        final Organization organization = new Organization();
        organization.setOrganizationName(request.getOrganizationName());
        organization.setPassword(request.getPassword());
        organization.setEmail(request.getEmail());

        return organization;
    }

    public static OrganizationDto map(final Organization organization) {
        return OrganizationDto.Builder()
                .withOrganizationName(organization.getOrganizationName())
                .withEmail(organization.getEmail())
                .withConferenceRooms(organization.getConferenceRooms())
                .build();
    }
}
