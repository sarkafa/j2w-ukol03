package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {

  private final List<Vizitka> seznamVizitek = List.of(
          new Vizitka("Aneta Folmánková", "Alza", "U Botiče 1391/5", "140 00", "aneta@seznam.cz", 600200100, "www.aneta.cz"),
          new Vizitka("Barbora Malá", "Kabát", "Slezská 126/6", "120 00", null, 700200100, "www.barbora.cz")
  );

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("seznam", seznamVizitek);
    return modelAndView;
  }

  @GetMapping("/detail/{id}")
  public ModelAndView detail(@PathVariable int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("vizitka", seznamVizitek.get(id));
    return modelAndView;
  }
}
