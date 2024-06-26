package br.ucsal.demoappa.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
public class DemoappAController {

    @Autowired 
    private DiscoveryClient discoveryClient; 

    @GetMapping("/sum")
    public int getSum() {
        List<ServiceInstance> instances = discoveryClient.getInstances("APP-B");
        if (instances.isEmpty()) {
            return -1; 
        }
      
        ResponseEntity<Integer> response = new RestTemplate().getForEntity("http://localhost:8081/random", Integer.class);
        int resultFromB = response.getBody();

        return resultFromB;
    }
}
