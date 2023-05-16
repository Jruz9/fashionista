import React from 'react'
import { Routes, Route } from 'react-router-dom';
import ClothesPage from '../pages/ClothesPage';
import Homepage from '../pages/Homepage';



function AppRoutes() {


    return(
        <Routes>
            <Route path="/"element={<Homepage/>}/>
            <Route path='/clothes' element={<ClothesPage/>}/>
            <Route path="/looks"element={""}/>
            <Route path='/collections' element={""}/>
            
        </Routes>
    )
}

export default AppRoutes;