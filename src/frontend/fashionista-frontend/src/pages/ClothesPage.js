//This is the page for displaying information and actions for clothing.

import { Stack } from "@mui/material";
import CreateCloth from "../components/clothes/CreateClothComponent";
import ListAllClothing from "../components/clothes/ListAllClothingComponent";
import UpdateDeleteClothesList from "../components/clothes/UpdateAndDeleteClothesModal";





function  ClothesPage() {


    return(
        <div>
            <Stack direction="row" spacing={2} justifyContent="flex-end">
            <CreateCloth/>
            <UpdateDeleteClothesList/>
            </Stack>
            <ListAllClothing/>
        </div>
    )
}

export default ClothesPage;