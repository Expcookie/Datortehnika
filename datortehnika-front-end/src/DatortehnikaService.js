import axios from "axios"

const DATORTEHNIKA_API_BASE_URL = "http://localhost:8080/api/v1/Datortehnika"

class DatortehnikaService {

    savePieprasijums(datortehnika) {
        return axios.post(DATORTEHNIKA_API_BASE_URL, datortehnika);
    }
}

export default new DatortehnikaService();