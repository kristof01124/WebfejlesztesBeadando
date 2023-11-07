package hu.unideb.inf.webfejlesztesbeadando.service.impl;

import hu.unideb.inf.webfejlesztesbeadando.DTO.OrderDTO;
import hu.unideb.inf.webfejlesztesbeadando.DTO.SiteUserDTO;
import hu.unideb.inf.webfejlesztesbeadando.entity.Order;
import hu.unideb.inf.webfejlesztesbeadando.entity.SiteUser;
import hu.unideb.inf.webfejlesztesbeadando.repository.SiteUserRepository;
import hu.unideb.inf.webfejlesztesbeadando.service.SiteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class SiteUserServiceImplementation implements SiteUserService {

    @Autowired
    private SiteUserRepository siteUserRepository;

    @Override
    public SiteUserDTO create(SiteUserDTO siteUserDTO) {
        SiteUser siteUser = new SiteUser(siteUserDTO.userId(), siteUserDTO.firstName(), siteUserDTO.lastName(), siteUserDTO.username(), siteUserDTO.password(), new ArrayList<>());
        siteUser = siteUserRepository.save(siteUser);
        return new SiteUserDTO(siteUser.getUserId(), siteUser.getFirstName(), siteUser.getLastName(), siteUser.getUsername(), siteUser.getPassword());
    }

    @Override
    public SiteUserDTO update(SiteUserDTO siteUserDTO) {
        SiteUser siteUser = new SiteUser(siteUserDTO.userId(), siteUserDTO.firstName(), siteUserDTO.lastName(), siteUserDTO.username(), siteUserDTO.password(), new ArrayList<>());
        siteUser = siteUserRepository.save(siteUser);
        return new SiteUserDTO(siteUser.getUserId(), siteUser.getFirstName(), siteUser.getLastName(), siteUser.getUsername(), siteUser.getPassword());
    }

    @Override
    public List<SiteUserDTO> readAll() {
        return siteUserRepository.findAll().stream().map((SiteUser siteUser) -> {
            return new SiteUserDTO(siteUser.getUserId(), siteUser.getFirstName(), siteUser.getLastName(), siteUser.getUsername(), siteUser.getPassword());
        }).toList();
    }

    @Override
    public void delete(Long id) {
        siteUserRepository.delete(siteUserRepository.getReferenceById(id));
    }
}
