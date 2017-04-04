<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
<form method="POST" action="display.php">
	<input type="date" data-date-inline-picker="true" name="pickup"/>
	
	<input type="submit" name="submit" id="submit" value="Submit">
</form>

	
	
<?php
	$timezone = "<script>document.write(new Date());</script>";
	//echo $timezone;
	//checking if the date is set or not
	if(isset($_POST['pickup']))
	{
		display();
	}
	
	function display(){
		session_start();
		$timezone = $_SESSION['time'];
		//echo $timezone . "<br><br>";
		$url = 'https://raw.githubusercontent.com/copart-internship/copart-internship.github.io/master/Documents/sale-data.json';
		$content = file_get_contents($url);
		$json = json_decode($content, true);
		//echo $json["data"]["saleList"]["facility"];
		echo "<table border='2'><th>Place</th><th>Time</th>";
		foreach($json["data"]["saleList"] as $i){
			$date1 = $i['auctionDate']['dateAsInt'];
			//echo $date1;
			$date2= substr_replace($date1, "-", 4, 0);
			$date2= substr_replace($date2, "-", 7, 0);
			//displaying results only for the date mentioned in the calendar
			if($_POST['pickup']==$date2){
				echo "<tr><td>".$i["facility"]. "</td><td>". $i["startTime"]." ". $i["timeZoneCode"]."</td></tr>";
				/*
				Tried converting to users timezone, got stuck on an error. Commented the area where I couldnt do the conversion.
				
				$gmtTimezone = new DateTimeZone($i["timeZoneCode"]);
				$myDateTime = new DateTime($date2.' '.$i["startTime"], $gmtTimezone);
				//echo $myDateTime->format('Y-m-d H:i:s');
				$offset = $timezone->getOffset($myDateTime);
				$myInterval=DateInterval::createFromDateString((string)$offset . 'seconds');
				$myDateTime->add($myInterval);
				$result = $myDateTime->format('Y-m-d H:i:s');
				echo $result."<br>";
				*/
			}
		}
		echo "</table>";
	}
	
?>

</body>

</html>