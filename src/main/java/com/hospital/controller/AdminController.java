/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hospital.controller;

import com.hospital.service.AdminServiceimp;
import com.hospital.service.DoctorServiceimp;
import com.hospital.service.DoseServiceimp;
import com.hospital.service.DragServiceimp;
import com.hospital.service.PatientServiceimp;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import model.Admin;
import model.Doctors;
import model.Dosage;
import model.Drags;
import model.PatientDitails;
import model.Patients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class AdminController {

    @Autowired
    AdminServiceimp adminServiceimp;
    @Autowired
    DoctorServiceimp doctorServiceimp;
    @Autowired
    DoseServiceimp doseServiceimp;
    @Autowired
    DragServiceimp dragServiceimp;
    @Autowired
    PatientServiceimp patientServiceimp;

    
    
    
      @RequestMapping(value = "/add_dosage_form", method = RequestMethod.GET)
    public String addDosageform() { 
        return "add_dos";
    }
    
    @RequestMapping(value = "/add_doctor_form", method = RequestMethod.GET)
    public String addDoctorform() { 
        return "add_doc";
    }
   @RequestMapping(value = "/add_patient_form", method = RequestMethod.GET)
    public String addPatientsform() { 
        return "add_pat";
    }

    
    @RequestMapping(value = "/add_drags_form", method = RequestMethod.GET)
    public String addDragsForm() {

        return "add_dra";
    }
    
    @RequestMapping(value = "/loginAdmin", method = RequestMethod.GET)
    public String loginAdmin() {
        return "loginAdmin";
    }
    
     @RequestMapping(value = "/loginDoctor", method = RequestMethod.GET)
    public String loginDoctor() {
        return "loginDoctor";
    }
    
     @RequestMapping(value = "/loginPatient", method = RequestMethod.GET)
    public String loginPatient() {
        return "loginPatient";
    }
    
    
    @RequestMapping(value = "/list_drags", method = RequestMethod.GET)
    public String listdrags(ModelMap model) {

        List<Drags> dragsList = dragServiceimp.getList();

        System.out.println("Size:" + dragsList.size());
        model.addAttribute("dragsList", dragsList);
        return "list_dra";
    }

    @RequestMapping(value = "/list_dosage", method = RequestMethod.GET)
    public String listdoses(ModelMap model) {

        List<Dosage> doseList = doseServiceimp.getList();

        System.out.println("Size:" + doseList.size());
        model.addAttribute("doseList", doseList);
        return "list_dos";
    }

    @RequestMapping(value = "/list_doctor", method = RequestMethod.GET)
    public String listDoctor(ModelMap model) {

        List<Doctors> doctorList = doctorServiceimp.getList();

        System.out.println("Size:" + doctorList.size());
        model.addAttribute("doctorList", doctorList);
        return "list_docs";
    }

    @RequestMapping(value = "/list_admin", method = RequestMethod.GET)
    public String listAdmin(ModelMap model) {

        List<Admin> adminList = adminServiceimp.getList();

        System.out.println("Size:" + adminList.size());
        model.addAttribute("adminList", adminList);
        return "list_adm";
    }

    @RequestMapping(value = "/list_patient", method = RequestMethod.GET)
    public String listUser(ModelMap model) {

        List<PatientDitails> patientList = adminServiceimp.getAllPList();

        System.out.println("Size:" + patientList.size());
        model.addAttribute("patientList", patientList);
        return "list_pat";
    }

       @RequestMapping(value = "/add_drags", method = RequestMethod.POST)
    public String addDrags(@ModelAttribute("emp") Drags drags,ModelMap model) {

        boolean status = dragServiceimp.addData(drags);

        
        List<Drags> dragsList = dragServiceimp.getList();

        System.out.println("Size:" + dragsList.size());
        model.addAttribute("dragsList", dragsList);
        
       
            return "list_dra";
        
    }

    @RequestMapping(value = "/add_dosage", method = RequestMethod.POST)
    public String addDosage(@ModelAttribute("dosage") Dosage dosage ,ModelMap model) throws SQLException{

        boolean status = doseServiceimp.addData(dosage);
        
        
 List<Dosage> doseList = doseServiceimp.getList();

        System.out.println("Size:" + doseList.size());
        model.addAttribute("doseList", doseList);
        return "list_dos";
    }

    @RequestMapping(value = "/add_patient", method = RequestMethod.POST)
    public String addPatient(@ModelAttribute("patient") Patients patients  ,ModelMap model) {

        boolean status = patientServiceimp.addData(patients);

        
        List<PatientDitails> patientList = adminServiceimp.getAllPList();

        System.out.println("Size:" + patientList.size());
        model.addAttribute("patientList", patientList);
        return "list_pat";
    }

    @RequestMapping(value = "/add_doctor", method = RequestMethod.POST)
    public String addDoctor(@RequestBody Doctors Doctors) {

        boolean status = doctorServiceimp.addData(Doctors);

        if (status) {
            return "{\"status\":\"Success\"}";
        } else {
            return "{\"status\":\"fail\"}";
        }
    }

    @RequestMapping(value = "/add_admin", method = RequestMethod.POST)
    public String addAdmin(@RequestBody Admin admin) {

        boolean status = adminServiceimp.addData(admin);

        if (status) {
            return "{\"status\":\"Success\"}";
        } else {
            return "{\"status\":\"fail\"}";
        }
    }

    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String deleteUser(@RequestBody String id) throws Exception {

        System.out.println("id received " + id);
        long id1 = Long.parseLong(id);
        adminServiceimp.deleteData(id1);

        return "{\"status\":\"Success\"}";
    }

    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    public String showEditForm(ModelMap model, HttpServletRequest rq) throws Exception {

        long id1 = Long.parseLong(rq.getParameter("id"));
        Admin existingUser = adminServiceimp.getSingleUser(id1);

        model.addAttribute("user", existingUser);
        System.out.println();

        return "  ";
    }

    @RequestMapping(value = "/update_admin", method = RequestMethod.POST)
    public String updateUser(HttpServletRequest rq) throws Exception {

        int id = Integer.parseInt(rq.getParameter("id"));
        String name = rq.getParameter("name");
        String password = rq.getParameter("password");

        Admin admin = new Admin(id, name, password);
        adminServiceimp.updateData(admin);
//        List<Client> usersList = clientService.getUserList();
//        model.addAttribute("list", usersList);

        return " ";
    }

}
