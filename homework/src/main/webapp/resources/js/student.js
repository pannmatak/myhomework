$(document).ready(function() {
	renderStudentList();
	
	function renderStudentList() {
		var url = baseUrl + "api/students";
			$tblStudents = $("#tblStudents");
			var tblStudents = [];
			$.get(url, function(students){
				$.each(students, function(index, student){
					
					var $trStudent = $("<tr>").append(
						$("<td>").text(student.stu_code)
					).append(
						$("<td>").text(student.stu_name)
					).append(
						$("<td>").text(student.stu_gender)
					).append(
						$("<td>").text(student.stu_age)
					).append(
						$("<td>").text(student.stu_db)
					)
					.append(
						$("<td>").text(student.stu_address)
					).append(
						$("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Edit">' +
										'<button class="btn btn-primary btn-xs" data-title="Edit" data-toggle="modal" data-target="#edit" >' +
										'<span class="glyphicon glyphicon-pencil">' +
										'</span>' +
										'</button>' +
									   	'</p>')
					).append(
						$("<td>").html('<p data-placement="top" data-toggle="tooltip" title="Delete">' +
										'<button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" >' + 
										'<span class="glyphicon glyphicon-trash">' +
										'</span>' +
										'</button>' +
										'</p>')
					);
					
					tblStudents.push($trStudent);
				});
				$tblStudents.html(tblStudents);
			});
	}
	
});