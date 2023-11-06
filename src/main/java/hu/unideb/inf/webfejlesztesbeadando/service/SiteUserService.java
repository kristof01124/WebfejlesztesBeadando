package hu.unideb.inf.webfejlesztesbeadando.service;

import hu.unideb.inf.webfejlesztesbeadando.DTO.SiteUserDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SiteUserService {

    public SiteUserDTO create(SiteUserDTO siteUserDTO);

    public SiteUserDTO update(SiteUserDTO siteUserDTO);

    public List<SiteUserDTO> readAll();

    public void delete(Long id);
}
