/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import entidade.Pincel;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Rafael.Soares
 */
@RestController 
public class Controle {
    
    @CrossOrigin(origins = "http://editor.swagger.io")
    @RequestMapping(method = RequestMethod.PUT,
            value = "/pincel/{id}")
    public Pincel atualizarPincel(@RequestBody Pincel p,
                               @PathVariable("id") int id){
        //jogar p no banco de dados e receber do banco de dados o id
        //preencher o id de p
        
        p.setNum_serie(9876);
        
        
        return p;
    }
    
    
    @CrossOrigin(origins = "http://editor.swagger.io")
    @RequestMapping(method = RequestMethod.POST,
            value = "/pincel")
    public Pincel criarPincel(@RequestBody Pincel p){
        //jogar p no banco de dados e receber do banco de dados o id
        //preencher o id de p
        
        p.setNum_serie(9876);
        
        
        return p;
    }
    
    //GET Pincel
    @RequestMapping("/pincel")
    public List<Pincel> buscarPincel(){
        List resultado = new ArrayList<Pincel>();
        
        Pincel p1 = new Pincel();
        p1.setCor("Azul");
        p1.setIdentificador(1);
        p1.setNum_serie(999);
        
        resultado.add(p1);
        
        Pincel p2 = new Pincel();
        p2.setCor("Verde");
        p2.setIdentificador(2);
        p2.setNum_serie(777);
        
        resultado.add(p2);
        
        return resultado;
        
    }
    
    
}
