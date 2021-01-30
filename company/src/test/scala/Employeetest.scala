import com.knoldus.db.{CompanyReadDto, EmployeeReadDto}

import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
import org.scalatest.FunSuite
class Employeetest extends FunSuite{
  val emailValOb = new  EmailValidator()
  val companyReadDtoOb =new CompanyReadDto()
  val companyOb= new CompanyValidator()
  val EmployeeOb= new EmployeeValidator()
  val EmployeeDbOb = new EmployeeReadDto()
  test("Should return true if emailid is valid"){
    assert(emailValOb.emailIdIsValid(emailId = "aanchal.agarwal@knoldus.com")===true)
  }
  test("Should return true if emailid and company exist"){
    assert(EmployeeOb.employeeIsValid(EmployeeDbOb.Employee1)===true)}




  test("Should return true if company does not exist in database"){
    assert(!companyOb.companyIsValid(companyReadDtoOb.dellCompany)=== true)
  }



}
