package hu.unideb.inf.webfejlesztesbeadando.repository;

import hu.unideb.inf.webfejlesztesbeadando.entity.SiteUserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteUserRepository  extends JpaRepository<SiteUserDTO, Long> {
}
