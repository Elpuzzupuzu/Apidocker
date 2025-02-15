package com.MimitosShop.API.Repository;

import com.MimitosShop.API.Model.Gallery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryRepository extends JpaRepository<Gallery, Long> {
    // Aquí puedes agregar métodos personalizados si los necesitas

}
