import axios from "axios"

const CLOTH_API_BASE_URL="http://localhost:8080/api/v1/clothes"


class ClothServices{

    getAllClothes(){
        return axios.get(CLOTH_API_BASE_URL)
    }
    createClothes(clothes){
        return axios.post(CLOTH_API_BASE_URL,clothes)
    }
    getClothessById(clothesId){
        return axios.get(CLOTH_API_BASE_URL+"/"+clothesId)
    }
    updateClothes(clothesId,clothes){
        return axios.put(CLOTH_API_BASE_URL+"/"+clothesId,clothes)

    }
    deleteClothes(clothesId){
        return axios.delete(CLOTH_API_BASE_URL+'/'+clothesId)
    }

}
// eslint-disable-next-line import/no-anonymous-default-export
export default new ClothServices();