package tr.edu.medipol.yova.OgrenciWebServisi; 

import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.ArrayList;

@RestController                     
@RequestMapping("/ogrenci")          
public class OgrenciWebServisi {


    public static record Ogrenci(String adSoyad, String numara) {}

    private static final List<Ogrenci> OGRENCILER = new ArrayList<>();
    static {
        OGRENCILER.add(new Ogrenci("Ali", "1000000001"));
        OGRENCILER.add(new Ogrenci("Ayşe", "1000000002"));
        OGRENCILER.add(new Ogrenci("Fatma", "1000000003"));
    }
   

    @GetMapping("/listele")
    public List<Ogrenci> listele() {
        return OGRENCILER;  
    }
    

    @PostMapping("/Ekle")
    public boolean ekle(@RequestBody Ogrenci yeniOgrenci) {
        OGRENCILER.add(yeniOgrenci); 
        return true;  
    }
}

