package com.tnsif.placementmanagement.service;

import com.tnsif.placementmanagement.entity.Placement;
import com.tnsif.placementmanagement.repository.PlacementRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlacementService {

    private final PlacementRepository placementRepository;

    public PlacementService(PlacementRepository placementRepository) {
        this.placementRepository = placementRepository;
    }

    public List<Placement> getAllPlacements() {
        return placementRepository.findAll();
    }

    public Optional<Placement> getPlacementById(Long id) {
        return placementRepository.findById(id);
    }

    public Placement createPlacement(Placement placement) {
        return placementRepository.save(placement);
    }

    public Placement updatePlacement(Long id, Placement placementDetails) {
        Placement placement = placementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Placement not found"));

        placement.setStudentName(placementDetails.getStudentName());
        placement.setCompanyName(placementDetails.getCompanyName());
        placement.setRole(placementDetails.getRole());
        placement.setPackageOffered(placementDetails.getPackageOffered());
        placement.setPlacementDate(placementDetails.getPlacementDate());
        placement.setLocation(placementDetails.getLocation());
        placement.setContactEmail(placementDetails.getContactEmail());

        return placementRepository.save(placement);
    }

    public void deletePlacement(Long id) {
        placementRepository.deleteById(id);
    }
}

