	<!DOCTYPE html>
	<html lang="en">
	<head>
	    <meta charset="UTF-8">
	    <meta name="viewport" content="width=device-width, initial-scale=1.0">
	    <title>Multi-Step Form</title>
	    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
	    <style>
	        .step { display: none; }
	        .step.active { display: block; }
	    </style>
	</head>
	<body>
	    <div class="container mt-5">
	        <div class="card">
	            <div class="card-body">
	                <form id="multiStepForm" action="submitData" method="Get">
	                    <!-- Step 1: Personal Info -->
	                    <div class="step active" id="step1">
	                        <h4>Step 1: Personal Information</h4>
	                        <div class="mb-3">
	                            <label class="form-label">Name</label>
	                            <input type="text" class="form-control" id="name" name="name" required>
	                        </div>
	                        <div class="mb-3">
	                            <label class="form-label">Phone</label>
	                            <input type="text" class="form-control" id="phone" name="phone" required>
	                        </div>
	                        <div class="mb-3">
	                            <label class="form-label">Email</label>
	                            <input type="email" class="form-control" id="email" name="email" required>
	                        </div>
	                        <button type="button" class="btn btn-primary" onclick="nextStep(2)">Next</button>
	                    </div>
	                    
	                    <!-- Step 2: Education Details -->
	                    <div class="step" id="step2">
	                        <h4>Step 2: Education Details</h4>
	                        <table class="table" id="educationTable">
	                            <thead>
	                                <tr>
	                                    <th>Percentage</th>
	                                    <th>Board Name</th>
	                                    <th>Passing Year</th>
	                                    <th>Action</th>
	                                </tr>
	                            </thead>
	                            <tbody>
	                                <tr>
	                                    <td><input type="text" class="form-control" name="eddetails	[0].percentage"  required></td>
	                                    <td><input type="text" class="form-control" name="eddetails[0].board" required></td>
	                                    <td><input type="text" class="form-control" name="eddetails[0].year" required></td>
	                                    <td><button type="button" class="btn btn-danger" onclick="removeRow(this)">Remove</button></td>
	                                </tr>
	                            </tbody>
	                        </table>
	                        <button type="button" class="btn btn-success" onclick="addRow()">Add Row</button>
	                        <br><br>
	                        <button type="button" class="btn btn-secondary" onclick="prevStep(1)">Previous</button>
	                        <button type="button" class="btn btn-info" onclick="previewForm()">Preview</button>
	                        <button type="submit" class="btn btn-primary">Submit</button>
	                    </div>
	                </form>
	            </div>
	        </div>
	        
	        <!-- Preview Modal -->
	        <div class="modal fade" id="previewModal" tabindex="-1" aria-labelledby="previewModalLabel" aria-hidden="true">
	            <div class="modal-dialog">
	                <div class="modal-content">
	                    <div class="modal-header">
	                        <h5 class="modal-title" id="previewModalLabel">Form Preview</h5>
	                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	                    </div>
	                    <div class="modal-body" id="previewContent">
	                    </div>
	                    <div class="modal-footer">
	                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </div>
	
	    <script>
	        function nextStep(step) {
	            document.querySelector('.step.active').classList.remove('active');
	            document.getElementById('step' + step).classList.add('active');
	        }
	
	        function prevStep(step) {
	            document.querySelector('.step.active').classList.remove('active');
	            document.getElementById('step' + step).classList.add('active');
	        }
	
	        function addRow() {
	            let table = document.getElementById('educationTable').getElementsByTagName('tbody')[0];
	            let rowCount = table.rows.length;  // Get the current number of rows
	            let newRow = table.insertRow();
	            newRow.innerHTML = `
	                <td><input type="text" class="form-control" name="eddetails[${rowCount}].percentage" required></td>
	                <td><input type="text" class="form-control" name="eddetails[${rowCount}].board" required></td>
	                <td><input type="text" class="form-control" name="eddetails[${rowCount}].year" required></td>
	                <td><button type="button" class="btn btn-danger" onclick="removeRow(this)">Remove</button></td>`;
	        }
	
	        function removeRow(button) {
	            let row = button.parentElement.parentElement;
	            row.parentElement.removeChild(row);
	        }
	
	        function previewForm() {
	            let name = document.getElementById('name').value;
	            let phone = document.getElementById('phone').value;
	            let email = document.getElementById('email').value;
	            let tableRows = document.querySelectorAll('#educationTable tbody tr');
	            let educationData = '';
	            
	            tableRows.forEach(row => {
	                let cells = row.getElementsByTagName('input');
	                educationData += `<tr><td>${cells[0].value}</td><td>${cells[1].value}</td><td>${cells[2].value}</td></tr>`;
	            });
	            
	            let previewHTML = `
	                <p><strong>Name:</strong> ${name}</p>
	                <p><strong>Phone:</strong> ${phone}</p>
	                <p><strong>Email:</strong> ${email}</p>
	                <h5>Education Details:</h5>
	                <table class='table'><thead><tr><th>Percentage</th><th>Board Name</th><th>Passing Year</th></tr></thead><tbody>${educationData}</tbody></table>
	            `;
	            document.getElementById('previewContent').innerHTML = previewHTML;
	            new bootstrap.Modal(document.getElementById('previewModal')).show();
	        }
	    </script>
	    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
	</body>
	</html>
