import axios from "axios"

const COLLECTION_API_BASE_URL="http://localhost:8080/api/v1/collections"


class collectionService{

    getAllCollections(){
        return axios.get(COLLECTION_API_BASE_URL)
    }
    createCollection(clothes){
        return axios.post(COLLECTION_API_BASE_URL,clothes)
    }
    getAllCollectionById(clothesId){
        return axios.get(COLLECTION_API_BASE_URL+"/"+clothesId)
    }
    updateCollection(clothesId,clothes){
        return axios.put(COLLECTION_API_BASE_URL+"/"+clothesId,clothes)

    }
    deleteLooks(clothesId){
        return axios.delete(COLLECTION_API_BASE_URL+'/'+clothesId)
    }

}

export default new  collectionService();