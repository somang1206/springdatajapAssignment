package com.ohgiraffers.pet.controller;


import com.ohgiraffers.pet.dto.MemberDTO;
import com.ohgiraffers.pet.dto.PetDTO;
import com.ohgiraffers.pet.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/pet")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService){
        this.petService = petService;
    }

    @GetMapping("/{petCode}")
    public String findPetByCode(@PathVariable int petCode, Model model){
        PetDTO pet = petService.findPetByCode(petCode);

        model.addAttribute("pet", pet);

        return "pet/detail";
    }

    @GetMapping("/list")
    public String findPetList(Model model){
        List<PetDTO> petList = petService.findPetList();

        model.addAttribute("petList", petList);

        return "pet/list";
    }

    @GetMapping(value = "/refMemCode", produces = "application/json; charset=UTF-8")
    @ResponseBody
    public List<MemberDTO> findMemCodeList() {
        return petService.findAllMemCode();
    }

    @PostMapping("/regist")
    public String registNewPet(PetDTO petDTO){
        petService.registNewPet(petDTO);
        System.out.println(petDTO);
        return "redirect:/pet/list";
    }
}
