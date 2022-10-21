import axios from "axios"

const lOOKS_API_BASE_URL="http://localhost:8080/api/v1/looks"


class LookService{

    getAllClothes(){
        return axios.get(lOOKS_API_BASE_URL)
    }
    createLook(clothes){
        return axios.post(lOOKS_API_BASE_URL,clothes)
    }
    getAllLooksById(clothesId){
        return axios.get(lOOKS_API_BASE_URL+"/"+clothesId)
    }
    updateLooks(clothesId,clothes){
        return axios.put(lOOKS_API_BASE_URL+"/"+clothesId,clothes)

    }
    deleteLooks(clothesId){
        return axios.delete(lOOKS_API_BASE_URL+'/'+clothesId)
    }

}

export default new  LookService();