package dev.authorises.jSpecs.controllers;

import dev.authorises.jSpecs.JSpecsApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import oshi.SystemInfo;
import oshi.hardware.HardwareAbstractionLayer;

@RestController
public class HardwareController {

    @GetMapping("/hardware")
    HardwareAbstractionLayer getSystemInfo(){
        return JSpecsApplication.systemInfo.getHardware();
    }

}
