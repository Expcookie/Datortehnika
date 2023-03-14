import './App.css';
import TestImage from './test.jpg';
import {useState} from 'react'
import DatortehnikaService from './DatortehnikaService';

function App() {
	
	const [datortehnika, setDatortehnika] = useState({
		id: "",
		datortehnika: "",
		pamatojums: ""
	});

	const handleChange = (e) =>{
		const value = e.target.value;
		setDatortehnika({...datortehnika, [e.target.name]: value})
	}

	const savePieprasijums = (e) => {
		e.preventDefault();
		DatortehnikaService.savePieprasijums(datortehnika).then((response) => {
			console.log(response);
		})
		.catch((error) => {
			console.log(error)
		})
	}

  return (
    <div className="App">
		<header className="App-header">
			<h1> Datortehnikas izvēle </h1>
		<p>
			Lūdzu izvēlaties sev nepieciešamo datortehniku un nospiediet pogu "Pieprasīt".
		</p>
		</header>
		
		<p className="text">
			Datortehnika:
		</p>

		<input name="datortehnika" value={datortehnika.datortehnika} onChange={(e) => handleChange(e)}>

		</input>
		<p className="text">
			Pamatojums:
		</p>

		<textarea name="pamatojums" value={datortehnika.pamatojums} onChange={(e) => handleChange(e)}>

		</textarea>

		<button type='submit' className="Request-button" onClick={savePieprasijums}>
			Pieprasīt
		</button>
	</div>
);
}

export default App;
