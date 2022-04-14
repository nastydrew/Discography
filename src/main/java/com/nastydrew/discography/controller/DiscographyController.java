package com.nastydrew.discography.controller;

import com.nastydrew.discography.model.Discography;
import com.nastydrew.discography.service.DiscographyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class DiscographyController {
    private DiscographyService discographyService;

    @Autowired
    public void setDiscographyService(DiscographyService discographyService) {
        this.discographyService = discographyService;
    }

    // При старті повертає стартову сторінку index.jsp
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView allDiscography() {
        List<Discography> discographyList = discographyService.allDiscography();

        return new ModelAndView("index").addObject("discographyList", discographyList);
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    public ModelAndView editPage(@PathVariable("id") int id) {
        return new ModelAndView("edit").addObject("discography", discographyService.getById(id));
    }

    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public ModelAndView editDiscography(@ModelAttribute("discography") Discography discography) {
        discographyService.edit(discography);
        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public ModelAndView addPage() {
        return new ModelAndView("edit");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ModelAndView addDiscography(@ModelAttribute("discography") Discography discography) {
        discographyService.add(discography);

        return new ModelAndView("redirect:/");
    }

    @RequestMapping(value="/delete/{id}", method = RequestMethod.GET)
    public ModelAndView deleteFilm(@PathVariable("id") int id) {
        discographyService.delete(discographyService.getById(id));

        return new ModelAndView("redirect:/");
    }
}
