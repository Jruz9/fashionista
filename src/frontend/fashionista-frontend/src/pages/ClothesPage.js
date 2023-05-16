//This is the page for displaying information and actions for clothing.

import CreateCloth from "../components/clothes/CreateClothComponent";
import ListAllClothing from "../components/clothes/ListAllClothingComponent";





function  ClothesPage() {


    return(
        <div>
            <CreateCloth/>
            <ListAllClothing/>
        </div>
    )
}

export default ClothesPage;