# NamedQueryExample
Example of the use of @NamedQuery

<p>In this example, a database ("example_mysql") is created based on Msql</p>

<p>The fundamental classes are</p>

<ul>
<li>Student</li>
<li>StudentInterface</li>
<li>DataLoader</li>
<li>StudentController</li>
</ul>

<p>The Student class is in charge of representing the model</p>
<p>The StudentInterface is in charge of create the JPA repository</p>
<p>The DataLoader class is in charge of populating the BD</p>
<p>TheStudentController class is in charge of bring the rest endpoints</p>

<p>One query is defined in the StudentInterface repository</p>

  @Query("select u from User u where u.firstname = :firstname or u.lastname = :lastname")
  User findByLastnameOrFirstname(@Param("lastname") String lastname,
                                 @Param("firstname") String firstname);

<p>This query is used in the controller class (StudentController)</p>

	@RequestMapping("/findbyname/{name}")
	public Student findUserByname(@PathVariable String name) {
	Student student =  studentRepo.findJonDoe(name);
	
	return student;
	}
	
