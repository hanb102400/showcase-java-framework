package com.rats.entity;

public class DeptEmpKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_emp.emp_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    private Integer empNo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column dept_emp.dept_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    private String deptNo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_emp.emp_no
     *
     * @return the value of dept_emp.emp_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public Integer getEmpNo() {
        return empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_emp.emp_no
     *
     * @param empNo the value for dept_emp.emp_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column dept_emp.dept_no
     *
     * @return the value of dept_emp.dept_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public String getDeptNo() {
        return deptNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column dept_emp.dept_no
     *
     * @param deptNo the value for dept_emp.dept_no
     *
     * @mbg.generated Mon Jun 24 07:12:35 CST 2019
     */
    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo == null ? null : deptNo.trim();
    }
}