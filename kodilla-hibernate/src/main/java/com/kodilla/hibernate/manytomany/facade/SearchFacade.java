package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SearchFacade {
    @Autowired
    CompanyDao companyDao;
    @Autowired
    EmployeeDao employeeDao;

    public List<Company> searchCompany(String text) throws SearchProcessingException {
        text = "%" + text + "%";
        if (text.length() < 3) {
            throw new SearchProcessingException(SearchProcessingException.ERR_TOO_SHORT_FRAZE);
        }
        if (companyDao.findPartOfTheName(text).size() < 1) {
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_COMPANY_FOUND);
        }
        return companyDao.findPartOfTheName(text);
    }
    public List<Employee> searchEmployee(String text) throws SearchProcessingException {
        text = "%" + text + "%";
        if (text.length() < 3) {
            throw new SearchProcessingException(SearchProcessingException.ERR_TOO_SHORT_FRAZE);
        }
        if (employeeDao.findPartOfTheName(text).size() < 1) {
            throw new SearchProcessingException(SearchProcessingException.ERR_NO_EMPLOYEE_FOUND);
        }
        return employeeDao.findPartOfTheName(text);
    }

}