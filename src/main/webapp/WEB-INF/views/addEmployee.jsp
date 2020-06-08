<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee registration form</title>
<%@ include file = "header.jsp"%>
</head>
<body>
	<div class="container">
		<div class="panel">
			<div class="panel-default">
				<div class="row">
					<div class="col-md-2"></div>
					<div class="col-md-8 jumbotron">
						<form action="save_employee" method="post" class="form-horizontal">
						<fieldset>
						<legend>Employee Registration Form</legend>
							<div class="form-group">
								<label id="l">Employee Name</label> <input type="text"
									name="employeeName" id="ename" class="form-control">
							</div>
							<div class="form-group">
								<label>User Name</label> <input type="text" name="userName"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Mobile no</label> <input type="number" name="mobileNo"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Password</label> <input type="password" name="password"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Email</label> <input type="email" name="email"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Employee DOB</label> <input type="date" name="dob"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Gender</label> <input type="radio" name="gender"
									value="male">male <input type="radio" name="gender"
									value="female">female
							</div>
							<div class="form-check">
								<label class="fo">Employee Hobbies</label> <input
									type="checkbox" name="hobbies" value="reading" class="form-check-input">Reading
								<input type="checkbox" name="hobbies" value="playing" class="form-check-input">Playing
								<input type="checkbox" name="hobbies" value="dancing" class="form-check-input">Dancing

							</div>
							<div class="form-group">
								<label>Department</label> <select name="department"
									class="form-control">
									<option value="md" class="fo">MD</option>
									<option value="hr">HR</option>
									<option value="admin">Admin</option>
									<option value="it">IT</option>
									<option value="manager">Manager</option>
								</select>

							</div>
							<div class="form-group">
								<input type="submit" value="Submit" class="btn btn-success">
							</div>
							</fieldset>
						</form>
					</div>
					<div class="col-md-2"></div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>