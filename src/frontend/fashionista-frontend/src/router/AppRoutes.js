import React from 'react'
import { Routes, Route } from 'react-router-dom';
import ClothesPage from '../pages/ClothesPage';



function AppRoutes() {


    return(
        <Routes>
            <Route path="/"element={<ClothesPage/>}/>
            <Route path='/clothes' element={""}/>
            <Route path="/looks"element={""}/>
            <Route path='/collections' element={""}/>
            
        </Routes>
    )
}

export default AppRoutes;