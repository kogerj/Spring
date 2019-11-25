package springalgus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/algus")
    String tervitusfunktsioon() {
        return "Tere!";
    }

    @RequestMapping("/tervitus")
    String tervitus2(String eesnimi){
        return "Tere, "+eesnimi;
    }

		@RequestMapping("/korrutus")
		int korrutamine(int arv1, int arv2){
			return arv1*arv2;
		}

		@RequestMapping("/triangle")
		Double formula(double side1, double side2, double degrees ){
			double radians=Math.toRadians(degrees);
			return Math.sqrt(Math.pow(side1, 2)+Math.pow(side2, 2)-(2*side1*side2*Math.cos(radians)));
		}


    public static void main(String[] args) {
		//System.getProperties().put("server.port", 40305);
        SpringApplication.run(Rakendus.class, args);
    }
}
