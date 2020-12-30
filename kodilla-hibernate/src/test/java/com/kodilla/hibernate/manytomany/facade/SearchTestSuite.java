package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchTestSuite {
    @Autowired
    private SearchFacade searchFacade;
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;


    @Test
    public void testSearchCompany() throws SearchProcessingException {
        //Given
        Company bestSoft = new Company("Best Ccc Soft");

        //When
        companyDao.save(bestSoft);
        int bestSoftId = bestSoft.getId();

        String searchedCompany = "Ccc";
        List<Company> searchCompany = searchFacade.searchCompany(searchedCompany);

        //Then
        Assert.assertEquals(1, searchCompany.size());

        //CleanUp
        try {
            companyDao.deleteById(bestSoftId);
        } catch (Exception e) {
            //do nothing
        }

    }
    @Test
    public void testSearchEmployee() throws SearchProcessingException {
        //Given
        Employee johnAshen = new Employee("John", "Ashen");

        //When
        employeeDao.save(johnAshen);
        int johnAshenId = johnAshen.getId();

        String searchedEmployee = "she";
        List<Employee> employeeLastname = searchFacade.searchEmployee(searchedEmployee);

        //Then
        Assert.assertEquals(1, employeeLastname.size());

        //CleanUp
        try {
            employeeDao.deleteById(johnAshenId);
        } catch (Exception e) {
            //do nothing
        }

    }

}
