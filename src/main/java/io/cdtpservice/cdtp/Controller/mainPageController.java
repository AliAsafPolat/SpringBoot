package io.cdtpservice.cdtp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.cdtpservice.cdtp.Model.Sera;
import io.cdtpservice.cdtp.Service.SeraService;

@Controller
public class mainPageController {
	
	@Autowired
	private SeraService seraService;
	
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String getAppPage(ModelMap model) {
		
		return "appPage";
	}
	
	@RequestMapping(value="/main", method = RequestMethod.GET)
	public String getMainPage(ModelMap model) {
		List<Sera> seralar = seraService.get();
		List<Integer> hedef_sicakliklar = new ArrayList();
		hedef_sicakliklar.add(seralar.get(0).getHedef_sicaklik());
		hedef_sicakliklar.add(seralar.get(1).getHedef_sicaklik());
		model.put("seralar_guncel_hedef_sicaklik", hedef_sicakliklar);
		return "mainPage";
	}
	// Anasayfadan yapılan post isteklerini karşılayacak. Yani sıcaklık güncelleme bilgileri.
	@RequestMapping(value="/main", method = RequestMethod.POST)
	public String postMessage(ModelMap model, @RequestParam(value="sera1", required=false) Integer sera1, @RequestParam(value="sera2", required=false) Integer sera2) { 
		
		
		
		// Butona tıklandığında eğer sera1 değer girilmiş ise veritabanından hedef sıcaklık değeri değişcek.
		if(sera1!=null) {
			Sera s1 = seraService.get(1);
			s1.setHedef_sicaklik(sera1);
			seraService.save(s1);
		}
			
		
		if(sera2!=null) {
			Sera s2 = seraService.get(2);
			s2.setHedef_sicaklik(sera2);
			seraService.save(s2);
		}
		
		List<Sera> seralar = seraService.get();
		List<Integer> hedef_sicakliklar = new ArrayList();
		hedef_sicakliklar.add(seralar.get(0).getHedef_sicaklik());
		hedef_sicakliklar.add(seralar.get(1).getHedef_sicaklik());
		model.put("seralar_guncel_hedef_sicaklik", hedef_sicakliklar);
			
		return "mainPage";
	}
	
	
	
}
